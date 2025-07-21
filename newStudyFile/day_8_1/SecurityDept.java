package newStudyFile.day_8_1;

public class SecurityDept implements Department{

    @Override
    public void onEvent(String type, String user) {
        if(type.equals("signup")){
            System.out.println("[보안]"+user+"님이 회원가입 했습니다.");
        }else if(type.equals("withdrawal")){
            System.out.println("[보안]"+user+"님이 탈퇴했습니다.");
        }
    }
    
}
