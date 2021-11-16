package mmms.member.action;
import java.util.ArrayList;
//7-2. 회원정보 보기
import java.util.Scanner;

import mmms.member.svc.MemberListService;
import mmms.member.util.ConsoleUtil;
import mmms.member.vo.Member;

public class MemberListAction implements Action {

	@Override
	public void execute(Scanner sc) throws Exception {
		
		ConsoleUtil cu = new ConsoleUtil();
		MemberListService memberListService = new MemberListService();
		ArrayList<Member> memberList = memberListService.getMemberList();
		cu.printMemberLIst(memberList);//select all 출력

	}

}
