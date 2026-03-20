package dao;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import interfaces.Salvable;
import interfaces.Storage;
import model.Book;
import model.User;

public class UserDao implements Storage<User>, Salvable<User>{
	private List<User> userList = new ArrayList<User>();

	@Override
	public List<User> getAll() {
		List<User> list = new ArrayList<User>(userList);
		return list;
	}

	@Override
	public User findOne(int id) {
		// TODO Auto-generated method stub
		User user = userList.stream().filter(u -> u.getCardId() == id).findFirst().orElse(null);
		return user;
	}

	@Override
	public boolean add(User u) {
		if(!userList.contains(u)) {			
			userList.add(u);
			return true;
		}
		return false;
	}

	@Override
	public boolean update(User user) {
		User toUpdateUser = userList.stream().filter(u -> u.getCardId() == user.getId()).findFirst().orElse(null);
		if(toUpdateUser != null) {
			toUpdateUser.setName(user.getName());
			toUpdateUser.setSurname(user.getSurname());
			toUpdateUser.setEmail(user.getEmail());
			return true;
		}
		
		return false;
	}

	@Override
	public boolean remove(int id) {
		User removeUser = userList.stream().filter(u -> u.getCardId() == id).findFirst().orElse(null);
		if(removeUser != null) {
			userList.remove(removeUser);
			return true;
		}
		
		return false;
	}
	
	@Override
    public void writeToFile(List<User> users) {
        List<String> data = users.stream().map(u -> {
            return u.getCardId() + "," + u.getName() + "," + u.getSurname() + "," + u.getEmail() + ";";
        }).collect(Collectors.toList());

        Path filePath = Path.of("file_java_utenti.csv");
        try {
            Files.write(filePath, data);
        } catch (IOException e) {
            System.err.println("Errore durante la scrittura del file: " + e.getMessage());
        }
    }

    @Override
    public void readFromFile() {
        Path filePath = Path.of("file_java_utenti.csv");

        try (Stream<String> lines = Files.lines(filePath)) {
        	lines.forEach(System.out::println);
        } catch (IOException e) {
            System.err.println("Errore nella lettura del file: " + e.getMessage());
        }
    }
	
}
