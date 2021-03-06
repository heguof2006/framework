package com.fw.user.controller;

import com.fm.user.model.User;
import com.fm.user.service.UserService;
import com.fw.user.utils.StatusCodeEnum;
import com.fw.user.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author 言曌
 * @date 2018/7/29 下午10:50
 */

@RestController
@RequestMapping("/client")
public class UserController {

    @Autowired(required = false)
    private UserService userService;

    @RequestMapping("/user")
    public ResponseEntity<ResultVO> userList() {
        List<User> userList = userService.listUsers();
        return ResponseEntity.ok().body(new ResultVO(StatusCodeEnum.SUCCESS_CODE.getCode(),
                StatusCodeEnum.SUCCESS_CODE.getMessage(), userList));
    }

    @GetMapping("/user/{id}")
    public ResponseEntity<ResultVO> userList(@PathVariable("id") Integer id) {
        User user = userService.getUserById(id);
        return ResponseEntity.ok().body(new ResultVO(StatusCodeEnum.SUCCESS_CODE.getCode(), StatusCodeEnum.SUCCESS_CODE.getMessage(), user));
    }


    @PostMapping("/user")
    public ResponseEntity<ResultVO> insertUser(@RequestBody User user) {
        User result = null;
        try {
            result = userService.insertUser(user);
        } catch (Exception e) {
            return ResponseEntity.status(StatusCodeEnum.DEFAULT_FAIL_CODE.getCode()).body(new ResultVO(StatusCodeEnum.DEFAULT_FAIL_CODE.getCode(), StatusCodeEnum.DEFAULT_FAIL_CODE.getMessage()));
        }
        return ResponseEntity.ok().body(new ResultVO(StatusCodeEnum.SUCCESS_CODE.getCode(), StatusCodeEnum.SUCCESS_CODE.getMessage(),result));
    }

    @PutMapping("/user")
    public ResponseEntity<ResultVO> updateUser(@RequestBody User user) {
        try {
            if(user != null && user.getId() != null) {
                userService.updateUser(user);
            } else {
                return ResponseEntity.status(StatusCodeEnum.DEFAULT_FAIL_CODE.getCode()).body(new ResultVO(StatusCodeEnum.DEFAULT_FAIL_CODE.getCode(), StatusCodeEnum.DEFAULT_FAIL_CODE.getMessage()));
            }
        } catch (Exception e) {
            return ResponseEntity.status(StatusCodeEnum.DEFAULT_FAIL_CODE.getCode()).body(new ResultVO(StatusCodeEnum.DEFAULT_FAIL_CODE.getCode(), StatusCodeEnum.DEFAULT_FAIL_CODE.getMessage()));
        }
        return ResponseEntity.ok().body(new ResultVO(StatusCodeEnum.SUCCESS_CODE.getCode(), StatusCodeEnum.SUCCESS_CODE.getMessage(), user));
    }

    @DeleteMapping("/user/{id}")
    public ResponseEntity<ResultVO> deleteUser(@PathVariable("id") Integer id) {
        try {
            userService.deleteUserById(id);
        } catch (Exception e) {
            return ResponseEntity.status(StatusCodeEnum.DEFAULT_FAIL_CODE.getCode()).body(new ResultVO(StatusCodeEnum.DEFAULT_FAIL_CODE.getCode(), StatusCodeEnum.DEFAULT_FAIL_CODE.getMessage()));
        }
        return ResponseEntity.ok().body(new ResultVO(StatusCodeEnum.SUCCESS_CODE.getCode(), StatusCodeEnum.SUCCESS_CODE.getMessage(),id));
    }


}
