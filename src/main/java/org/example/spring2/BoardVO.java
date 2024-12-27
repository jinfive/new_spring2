package org.example.spring2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data//get set toString
@AllArgsConstructor //모든 변수들 넣은 생성자
@NoArgsConstructor// 기본 생성자
public class BoardVO {
    private String id;
    private String name;
    private String content;
    private String email;
    //set메서드: 값을 넣을때!
    //스프링이 클라이언트로부터 받은 데이터를
    // 각 vo의 set메서드를 불러서 넣어줌
    //set 메서드가 받드시 있어야함
}
