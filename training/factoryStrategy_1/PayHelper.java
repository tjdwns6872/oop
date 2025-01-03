package training.factoryStrategy_1;

public class PayHelper {
    
    public PayHelper(){};

    public void pay(PaymentStrategy strategy, double price){
        StringBuilder sb = new StringBuilder();
        if(strategy.effectivenessCheck()){
            sb.append("["+strategy.getType().getDisplayName()+"]");
            sb.append(price);
            sb.append(" USD - 결제가 성공적으로 처리되었습니다.");
            System.out.println(sb.toString());
            //DB에 sb.toString() 저장
        }else{
            sb.append(strategy.getType().getDisplayName());
            sb.append("유효성 검사 실패");
            //DB에 sb.toString() 저장
            throw new IllegalArgumentException(sb.toString());
        }
    }
}
