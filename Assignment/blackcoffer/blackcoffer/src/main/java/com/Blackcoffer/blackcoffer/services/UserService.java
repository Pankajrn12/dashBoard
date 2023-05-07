package com.Blackcoffer.blackcoffer.services;

import com.Blackcoffer.blackcoffer.entities.UserEntity;
import com.Blackcoffer.blackcoffer.models.UserModel;
import com.Blackcoffer.blackcoffer.repositories.UserRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    // create By Pankaj Kumar Gupta

    @Transactional
    public ResponseEntity saveUserDetail(UserModel userModel) {
        UserEntity userEntity = new UserEntity();
        userEntity.setEndYear(userModel.getEndYear());
        userEntity.setIntensity(userModel.getIntensity());
        userEntity.setSector(userModel.getSector());
        userEntity.setRegion(userModel.getRegion());
        userEntity.setTopic(userModel.getTopic());
        userEntity.setInsight(userModel.getInsight());
        userEntity.setUrl(userModel.getUrl());
        userEntity.setStartYear(userModel.getStartYear());
        userEntity.setAdded(userModel.getAdded());
        userEntity.setPublished(userModel.getPublished());
        userEntity.setSource(userModel.getSource());
        userEntity.setTitle(userModel.getTitle());
        userEntity.setCountry(userModel.getCountry());
        userEntity.setCity(userModel.getCity());
        userEntity.setLikelihood(userModel.getLikelihood());

        userRepository.save(userEntity);
        return new ResponseEntity<>("saved successfully", HttpStatus.OK);
    }

    /*public List<UserModel> getAllUserDetails() {
        List<UserModel> userModelList = new ArrayList<>();
        List<UserEntity> userEntityList = userRepository.findAll();
        userEntityList.stream().forEach(data ->{
            UserModel userModel = new UserModel();
            userModel.setEndYear(data.getEndYear());
            userModel.setIntensity(data.getIntensity());
            userModel.setSector(data.getSector());
            userModel.setRegion(data.getRegion());
            userModel.setTopic(data.getTopic());
            userModel.setInsight(data.getInsight());
            userModel.setUrl(data.getUrl());
            userModel.setStartYear(data.getStartYear());
            userModel.setAdded(data.getAdded());
            userModel.setPublished(data.getPublished());
            userModel.setSource(data.getSource());
            userModel.setTitle(data.getTitle());
            userModel.setCountry(data.getCountry());
            userModel.setCity(data.getCity());
            userModel.setLikelihood(data.getLikelihood());
            userModelList.add(userModel);
        });
        return userModelList;
    }*/
}
