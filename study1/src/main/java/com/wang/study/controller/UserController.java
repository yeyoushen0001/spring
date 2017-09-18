package com.wang.study.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.wang.study.entity.User;
import com.wang.study.service.IUserService;

@Controller
public class UserController {

	@Resource
	private IUserService userService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index() {
		return "index";
	}

	@RequestMapping(value = "/users", method = RequestMethod.GET)
	public String getUsers(ModelMap modelMap) {
		// 查询user表中所有记录
		List<User> userList = userService.getUserAll();

		// 将所有记录传递给要返回的jsp页面，放在userList当中
		modelMap.addAttribute("userList", userList);

		// 返回jsp目录下的users.jsp页面
		return "users";
	}

	// get请求，访问添加用户 页面
	@RequestMapping(value = "/users/add", method = RequestMethod.GET)
	public String addUser() {
		// 转到 addUser.jsp页面
		return "addUser";
	}

	// post请求，处理添加用户请求，并重定向到用户管理页面
	@RequestMapping(value = "/users/addP", method = RequestMethod.POST)
	public String addUserPost(@ModelAttribute("user") User user) {
		// 注意此处，post请求传递过来的是一个User对象，里面包含了该用户的信息
		// 通过@ModelAttribute()注解可以获取传递过来的'user'，并创建这个对象

		// 数据库中添加一个用户，该步暂时不会刷新缓存
		userService.save(user);

		// 重定向到用户管理页面，方法为 redirect:url
		return "redirect:/users";
	}

	// 查看用户详情
	// @PathVariable可以收集url中的变量，需匹配的变量用{}括起来
	// 例如：访问 localhost:8080/users/show/1 ，将匹配 id = 1
	@RequestMapping(value = "/users/show/{id}", method = RequestMethod.GET)
	public String showUser(@PathVariable("id") Integer userId, ModelMap modelMap) {

		// 找到userId所表示的用户
		User user = userService.getUserById(userId);

		// 传递给请求页面
		modelMap.addAttribute("user", user);
		return "userDetail";
	}

	// 更新用户信息 页面
	@RequestMapping(value = "/users/update/{id}", method = RequestMethod.GET)
	public String updateUser(@PathVariable("id") Integer userId, ModelMap modelMap) {

		// 找到userId所表示的用户
		User user = userService.getUserById(userId);

		// 传递给请求页面
		modelMap.addAttribute("user", user);
		return "updateUser";
	}

	// 更新用户信息 操作
	@RequestMapping(value = "/users/updateP", method = RequestMethod.POST)
	public String updateUserPost(@ModelAttribute("userP") User user) {
		// 更新用户信息
		userService.updateUser(user);
		
		return "redirect:/users";
	}

	// 删除用户
	@RequestMapping(value = "/users/delete/{id}", method = RequestMethod.GET)
	public String deleteUser(@PathVariable("id") Integer userId) {

		// 删除id为userId的用户
		userService.delete(userId);
		
		return "redirect:/users";
	}

}
