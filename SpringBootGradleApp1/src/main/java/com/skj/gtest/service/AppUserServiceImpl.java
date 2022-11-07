package com.skj.gtest.service;


import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

import com.skj.gtest.entity.AppUser;
import com.skj.gtest.entity.Post;
import com.skj.gtest.entity.Profile;
import com.skj.gtest.repository.AppUserRepository;

public class AppUserServiceImpl implements AppUserService{
	@Autowired
	AppUserRepository userRepository;
	

	@Override
	@Transactional
	public AppUser insertUser(AppUser user) throws Exception {
		AppUser savedUser =  userRepository.save(user);  // Note :  save() is already implemented by Spring Data JPA
		if(savedUser != null)
		{
			return "App User Saved "+savedUser.getUserId()+" username :- "+savedUser.getUsername();
			return savedUser;
		}
		else return null;
	}
 public AppUser addHobbies(List<String> allHobbies,AppUser appUser) {
		return appUser;
	}
    


 @Override
	public AppUser getUserByUserName(String username) throws Exception {
		
		return userRepository.getUsersByUsername(username);
    }
     @Override
    public AppUser getUserByUserNameAndRole(String searchUsername, String role) {
	// TODO Auto-generated method stub
	return null;
    }
    @Override
    public List<AppUser> getAllUsers() {
    	List<AppUser> allUsers =  userRepository.findAll(); // Note : same as save
		return allUsers;
}
	@Override
	@Transactional
	public AppUser addPost(Post post, AppUser appUser) {

		List<Post> allUserPost = appUser.getAllPosts();

		if(allUserPost == null)
		{
			allUserPost = new ArrayList<>();
			allUserPost.add(post);
		}
		else
		{
			allUserPost.add(post);
		}

		appUser.setAllPosts(allUserPost);


		return appUser;
	}
	@Override
	public List<AppUser> getUsersByRole(String role) throws Exception {
		// TODO Auto-generated method stub
				System.out.println(" ---->> Inside Servive Impl role "+role);
				return userRepository.getAllUsersByRole(role);
	}
	@Override
	public List<AppUser> getUsersBetweenIds(int range1, int range2) throws Exception {
		// TODO Auto-generated method stub
		return userRepository.getUsersBetweenIds(range1, range2);
	}
	@Override
	@Transactional
	public AppUser linkProfile(Profile profile,AppUser appUser) {
		appUser.setUserProfile(profile);
		return appUser;
	}

	
}