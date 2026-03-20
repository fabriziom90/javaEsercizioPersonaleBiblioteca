package dao;

import java.util.ArrayList;
import java.util.List;

import interfaces.Storage;
import model.User;

public class UserDao implements Storage<User>{
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
		}
		return false;
	}

	@Override
	public boolean update(User user) {
		User toUpdateUser = userList.stream().filter(u -> u.getCardId() == user.getId()).findFirst().orElse(null);
		if(toUpdateUser != null) {
			user.setName(user.getName());
			user.setSurname(user.getSurname());
			user.setEmail(user.getEmail());
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
	
	
}
