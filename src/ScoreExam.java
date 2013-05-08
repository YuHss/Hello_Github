
public class ScoreExam {
	public static void main(String[] args) {
		int score[][] = 
			{
				{1, 3, 2, 4, 3, 1, 4, 2, 2, 1},
				{3, 2, 4, 2, 2, 1, 1, 3, 4, 1},
				{2, 4, 3, 2, 1, 2, 1, 3, 3, 4},
				{2, 3, 3, 1, 1, 3, 2, 2, 4, 4},
				{3, 1, 1, 2, 4, 1, 2, 3, 1, 3}
			};
		double score_num[] = { 15.5, 4.5, 13.7, 6.3, 4.9, 15.1, 16.1, 3.9, 7.0, 13.0};
		int answer[] = new int [10];
		
		if(args.length>=10){
			for(int i = 0 ; i < 10 ; i++ )
			{
				answer[i] = Integer.parseInt(args[i]);
			}
			
			for(int i = 0 ; i < score.length ; i++ )
			{
				double sum=0;
				boolean[] tf =
						new boolean[]{false,false,false,false,false,false,false,false,false,false};
				
				for(int j = 0; j < 10 ; j++)
				{
					if(score[i][j] == answer[j]){
						sum+=score_num[j];
						tf[j]=true;
					}
				}
				
				System.out.println("학생 "+(i+1)+"의 점수 : "+Math.round(sum*10.0)/10.0+"점" );
				
				for(int j = 0 ; j < 10 ; j++)
				{
					System.out.print((tf[j]?"O":"X"));
				}
				System.out.println();
				
			}
		}else{
			System.out.println("인수의 갯수가 맞지 않습니다.");
		}	
	}
}
