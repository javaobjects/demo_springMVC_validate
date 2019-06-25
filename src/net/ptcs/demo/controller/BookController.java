package net.ptcs.demo.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;

import net.ptcs.demo.entity.Book;

/**
 * 图书管理模块的控制器，也叫做处理器
* <p>Title: BookController</p>  
* <p>Description: </p>  
* @author xianxian 
* @date 2019年6月25日
*/

@Controller
@RequestMapping("book")
public class BookController {
	/**
	 * use:处理页面添加图书的请求
	 * 
	 * 今天我们的需求：
	 * 1.在处理添加图书请求前对book对象中的属性进行校验：
	 * bookId:非空校验，整数校验，大于0的校验
	 * bookName:非空校验，不能有非法字符（符合书名的正则表达式规范）
	 * intoStoreTime：非空校验
	 * publishName：非空校验，不能有非法字符（符合出版社名的正则表达式规范）
	 * price：非空校验，大于0，小数校验
	 * 
	 * 2.校验的时机：addBook方法调用之前校验，如果校验通过那么继续，没有通过那么返回页面，提示出错信息
	 * 
	 * @param book
	 * @return
	 */
	@RequestMapping("addBook.do")
	public String addBook(@Validated Book book,BindingResult bindingResult,Model model)
	{
		List<ObjectError> errors=bindingResult.getAllErrors();
		
		if(errors.size()>0)
		{
			//校验失败
//			把出错信息传给页面
			model.addAttribute("errors", errors);
			model.addAttribute("book", book);
			return "add_book";//   /+add_book+.jsp
		}else
		{
			//校验成功
			System.out.println("into addBook()方法。。。。。");
			System.out.println("book:"+book);
			return "";
		}
	}
}
