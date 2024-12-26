package org.example.spring2;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller//싱글톤 + 컨트롤러로 등록
public class MemberController {
    //method + url 요청 분석 -- > 함수 하나
    //method+url 요청 분석 --> 함수하나!
    @GetMapping("create")
    public String create() {

        return "create";
    }
    @PostMapping("create2")
    public String create2(MemberVO memberVO, Model model) {
        //Model이라는 크래스는 html에 값을 전달할때 사용하는 것.
        //이 메서드 실행시 필요하기 때문에 이 메서드의 파라메터로 선언하면 스프링이 찾아서 주소를 넣음.
        //model변수에 200번에 있다라고 주소를 넣어줌 객체는 주소만 알면 객체의 기능을 사용가능.
        //html에 전달할 값을 지정하자
        //model.addAttribute("id", memberVO.getId());
        //model.addAttribute("pw", memberVO.getPw());
        model.addAttribute("memberVO", memberVO);
        //여러개 넘길 수 있다.


        //id=apple&pw=1234
        //파라메터이름과 호추로디는 함수의 매개변수명은 같아야함
        //input name="파라메터명"
        //Input의 name이름 과 호출되는 매개변수명은 같아야함
        System.out.println(memberVO);

        //회원가입 결과를 html에 보내야할 것같음
        //html안에서는 컨트롤러가 보낸 결과를 프린트 해야해
        return "create2";
    }

    @GetMapping("delete")
    public String delete(MemberVO memberVO,Model model) {
        System.out.println("내가 삭제한 아이디>>"+memberVO.getId());
        model.addAttribute("memberVO", memberVO);
        return "delete";
    }

    @GetMapping("update")
    public String update(MemberVO memberVO,Model model) {
        System.out.println("내가 수정한 아이디>>"+memberVO.getId());
        model.addAttribute("memberVO", memberVO);
        return "update";
    }

    @PostMapping("read")
    public String read(int id) {
        //http의 body로 전달된 ID =100을 받아야함
        //String id = request.getParmeter(ID);
        //int id2 = Integer.parseInt(id);
        System.out.println("id: " + id);
        return "read";
    }

}
