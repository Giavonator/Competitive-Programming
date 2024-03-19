import java.util.*;
public class bessieInterview{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		int K = input.nextInt();

		//End Time, interviewer
		PriorityQueue<long[]> queue = new PriorityQueue<>((a,b) -> Long.compare(a[0], b[0]));
		LinkedList<Long> times = new LinkedList<>();
		ArrayList<HashSet<Integer>> interviewers = new ArrayList<>();


		for(int i = 0; i < N; i++){
			times.add(input.nextLong());
		}

		for(int i = 0; i < K; i++){
			int num = i;
			interviewers.add(new HashSet<Integer>(){{add(num);}}); //Create Sets Of Interviewers
			queue.add(new long[]{times.pop(), i}); //Queue Values
		}

		

		long prevTime = 0;
		ArrayList<Integer> prevInterviewers = new ArrayList<>();
		prevInterviewers.add(0);
		
		while(times.size() != 0){
			// System.out.println("AFTER INITIAL RUNNING w/ " + queue.peek()[0] + " END AND " + queue.peek()[1] + " INTER");
			
			long intTime = times.pop();
			// System.out.println("INTERVIEW TIMELENGTH: " + intTime);
			// System.out.println("PREV TIME: " + prevTime);

			if(queue.peek()[0] == prevTime){
				//System.out.println("EQUALS PREV TIME");
				prevInterviewers.add((int)queue.peek()[1]);

			}
			else{

				for(int i = 0; i < prevInterviewers.size(); i++){
					interviewers.get(prevInterviewers.get(i)).addAll(prevInterviewers);
				}

				prevInterviewers.clear();
				prevInterviewers.add((int)queue.peek()[1]);
				prevTime = queue.peek()[0];

			}

			queue.add(new long[]{queue.peek()[0] + intTime, queue.peek()[1]});

			// PriorityQueue<long[]> forPrint = new PriorityQueue<>((a,b) -> Long.compare(a[0], b[0]));
			// forPrint.addAll((queue));
			// for(int i = 0; i < 4; i++){
			//  	System.out.println(forPrint.poll()[0]);
			// }

			queue.poll();



		}

		// for(int i = 0; i < prevInterviewers.size(); i++){
		// 	interviewers.get(prevInterviewers.get(i)).addAll(prevInterviewers);
		// }

		int lastInterviewer = (int)queue.peek()[1];
		long answerTime = queue.peek()[0];

		while(queue.size() != 0){

			//System.out.println("AFTER PRINTING");

			// PriorityQueue<long[]> forPrint = new PriorityQueue<>((a,b) -> Long.compare(a[0], b[0]));
			// forPrint.addAll((queue));
			// for(int i = 0; i < 3; i++){
			//  	System.out.println(forPrint.poll()[0]);
			// }
			

			if(queue.poll()[0] == prevTime){
				prevInterviewers.add((int)queue.peek()[1]);
			}
			else{

				if(prevInterviewers.size() != 0){
					for(int i = 0; i < prevInterviewers.size(); i++){
						//System.out.println("INGINIET CHEKC");
						interviewers.get(prevInterviewers.get(i)).addAll(prevInterviewers);
					}
				}

				break;
			}

		}


		System.out.println(answerTime);
		LinkedList<Integer> arrayAnswer = new LinkedList<>(interviewers.get(lastInterviewer));
		int index = 0;
		for(int i = 0; i < K; i++){

			if(arrayAnswer.get(index) == i){
				System.out.print(1);
				index++;

				if(index == arrayAnswer.size()) break;
			}
			else System.out.print(0);
		}
		for(int i = 1; i < K - arrayAnswer.getLast(); i++){
			System.out.print(0);
		}
		


		input.close();
	}
	
}