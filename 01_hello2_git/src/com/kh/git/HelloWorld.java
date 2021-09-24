package com.kh.git;

import com.kh.foo.Foo;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello World~");
		System.out.println("Ok, bye~");
		
		System.out.println("안녕하세요, 저는 branch1입니다.");
		
		new Foo().say();
		//해당 내용은 원격저장소에서 수정한 내용입니다.
	}

}
