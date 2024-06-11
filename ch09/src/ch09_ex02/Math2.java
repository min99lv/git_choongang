package ch09_ex02;

public class Math2 {

	public static void main(String[] args) {
		double d1 = 4.156, d2 = 4.67, d3 = -4.15, d4 = - 4.67;
//		Round -> 반올림
		System.out.println("Round d1 = " + Math.round(d1));
		System.out.println("Round d2 = " + Math.round(d2));
		System.out.println("Round d3 = " + Math.round(d3));
		System.out.println("Round d4 = " + Math.round(d4));
//		floor -> 자기보다 작은 정수중 가장 큰것 = 내림
		System.out.println("floor d1 = "+Math.floor(d1));
		System.out.println("floor d2 = "+Math.floor(d2));
		System.out.println("floor d3 = "+Math.floor(d3));
		System.out.println("floor d4 = "+Math.floor(d4));
//		ceil -> 자기보다 큰 정수중 가장 작은것 = 올림
		System.out.println("ceil d1 ="+Math.ceil(d1));
		System.out.println("ceil d2 ="+Math.ceil(d2));
		System.out.println("ceil d3 ="+Math.ceil(d3));
		System.out.println("ceil d4 ="+Math.ceil(d4));

	}

}

//console
//Round d1 = 4
//Round d2 = 5
//Round d3 = -4
//Round d4 = -5
//floor d1 = 4.0
//floor d2 = 4.0
//floor d3 = -5.0
//floor d4 = -5.0
//ceil d1 =5.0
//ceil d2 =5.0
//ceil d3 =-4.0
//ceil d4 =-4.0

//ceil 
//이해 :마트에서 세일하기전에 값을 살짝 올린다 