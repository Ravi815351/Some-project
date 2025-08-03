import java.util.Scanner;
public class QuestionService
{

    String[] selection = new String[5];


    Question[]questions=new Question[5];// create arry of object of question class
    //so we can store multiple question in a single place
    // we still store rafrance of that object still not created that object

   public QuestionService()
   {// creating this constracter so that we can create
     //  object of eact indesx class which is strore at every index
       //this line create the object of class refrence wich is store in first index
       questions[0] = new Question(1, "size of int", "32 bytes", "36 bytes", "34 bytes", "38 bytes", "32 bytes");
       questions[1] = new Question(2, "size of double", "2 bytes", "6 bytes", "4 bytes", "8 bytes", "2 bytes");
       questions[2] = new Question(3, "size of char", "2 bytes", "6 bytes", "4 bytes", "8 bytes", "2 bytes");
       questions[3] = new Question(4, "size of long", "2 bytes", "6 bytes", "4 bytes", "8 bytes", "8 bytes");
       questions[4] = new Question(5, "size of boolean", "0 bytes", "1 bytes", "2 bytes", "3 bytes", "1 bytes");


   }


    public void playQuiz()
    {
        int i = 0;
        for (Question q : questions)
        {
            System.out.println("Question no. : " + q.getId());
            System.out.println(q.getQuestion());
            System.out.println(q.getOpt1());
            System.out.println(q.getOpt2());
            System.out.println(q.getOpt3());
            System.out.println(q.getOpt4());
            Scanner sc = new Scanner(System.in);
            selection[i] = sc.nextLine();
            i++;

        }
        for (String s : selection)
        {
            System.out.println(s);
        }
    }
    public void printScore()
    {
        int score = 0;
        for (int i = 0; i < questions.length; i++)
        {
            Question que = questions[i];
            String answer = que.getAnswer();
            String userAnswer = selection[i];
            if (answer.equals(userAnswer))
            {
                score++;
            }
        }
        System.out.println("Your score is : " + score);

    }

}