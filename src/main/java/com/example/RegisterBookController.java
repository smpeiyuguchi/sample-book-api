package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 書籍情報を登録するコントローラ.
 * 
 * @author hatakeyamakouta
 *
 */
@Controller
public class RegisterBookController {
	
	/**
	 * 書籍登録画面を表示する.
	 * 
	 * @return 書籍登録画面
	 */
	@RequestMapping("/")
	public String showRegisterBook(Model model) {
		return "register-book";
	}
	
}