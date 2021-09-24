package com.kh.git;

import com.kh.foo.Foo;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello World~");
		System.out.println("Ok, bye~");
		System.out.println("난 master branch에서 추가한 내용이야");
		
		System.out.println("안녕하세요, 저는 branch1입니다.");
		
		new Foo().say();
		//나 원격 저장소 연결 성공했어!
		
		System.out.println("여기는 원격저장소입니다.");
		System.out.println("여기는 원격저장소입니다222");
	}

}
