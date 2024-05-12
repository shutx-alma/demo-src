/*
 * 履歴 :
 * 	  No   日付       バージョン   内容
 * 	   1   2024/5/12  1.0.0        新規作成
 */

package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * トップ画面コントローラクラスです<br>
 * 
 * @version 1.0.0
 */
@Controller
public class TopCtrl{
	
	/**
	 * 画面表示
	 * @return top.jsp
	 */
	@GetMapping("/top")
	public String init() {
		
		System.out.println("get accessed!!");
		
		return "top";
	}
}