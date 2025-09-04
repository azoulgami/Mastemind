import java.util.*;


public class MasterMind {
    public static int a=0,b=0;
    public static void main () {
        System.out.println("🆆🅴🅻🅲🅾🅼🅴 🆃🅾 🅼🅰🆂🆃🅴🆁🅼🅸🅽🅳 by Ali Zoulgami");
        System.out.println();
        System.out.println();
        
        Scanner console=new Scanner(System.in);
        int correct=0;
       
        char [] colors=new char [4];
        char [] playerChoice=new char [4];
        char [] playerChoiceCopy=new char [4];
        String [][] circle=new String [11][4];
        a=0;
        b=0;
        for(int i=0;i<11;i++) {
            for(int j=0;j<4;j++) {
                circle[i][j]="N/A";
            }
        }
        char [] colorsCopy= new char [4];

        MakeAnswer(colors);
        
        
        System.out.println("A 4 Color Combination has been made");
        System.out.println("These 6 colors can either be green, black, blue, yellow, white, or red");
        System.out.println();
        System.out.println("You will have 10 guesses to guess the color combination in the correct order");
        System.out.println("\"X\" means that you guessed the right color at the right spot");
        System.out.println("\"O\" means that you guessed the right color but at the wrong spot");
        System.out.println("\"N/A\" means that the color does not exist");
        System.out.println("For each guess, type one color on each line");
        System.out.println();
        System.out.println("Color Code: ");
        System.out.println("g=green\nk=black\nb=blue\ny=yellow\nw=white\nr=red");
        System.out.println("Enjoy and Good Luck");
        
        
        
        System.out.println();
        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.println();
        
    
        
        
        for(int i=0;i<10;i++) {
            System.out.println("Enter a Guess");
            Ask(playerChoice);
            
            CopyArray(colors,colorsCopy,playerChoice,playerChoiceCopy);
            
            
            Check(colorsCopy,playerChoiceCopy,circle);
            
            System.out.println("Player Choice");
            System.out.println(Arrays.toString(playerChoice)+"   "+Arrays.deepToString(circle[i]));
            a++;
            b=0;
            if(circle[i][0].equals("X") && circle[i][1].equals("X") && circle[i][2].equals("X") && circle[i][3].equals("X")) {
                correct++;
                System.out.println("██╗░░░██╗░█████╗░██╗░░░██╗  ░██╗░░░░░░░██╗██╗███╗░░██╗");
                System.out.println("╚██╗░██╔╝██╔══██╗██║░░░██║  ░██║░░██╗░░██║██║████╗░██║");
                System.out.println("░╚████╔╝░██║░░██║██║░░░██║  ░╚██╗████╗██╔╝██║██╔██╗██║");
                System.out.println("░░╚██╔╝░░██║░░██║██║░░░██║  ░░████╔═████║░██║██║╚████║");
                System.out.println("░░░██║░░░╚█████╔╝╚██████╔╝  ░░╚██╔╝░╚██╔╝░██║██║░╚███║");
                System.out.println("░░░╚═╝░░░░╚════╝░░╚═════╝░  ░░░╚═╝░░░╚═╝░░╚═╝╚═╝░░╚══╝");
                break;
                
            }
            
        }
        if(correct==0) {
            System.out.println("██╗░░░██╗░█████╗░██╗░░░██╗  ██╗░░░░░░█████╗░░██████╗███████╗");
            System.out.println("╚██╗░██╔╝██╔══██╗██║░░░██║  ██║░░░░░██╔══██╗██╔════╝██╔════╝");
            System.out.println("░╚████╔╝░██║░░██║██║░░░██║  ██║░░░░░██║░░██║╚█████╗░█████╗░░");
            System.out.println("░░╚██╔╝░░██║░░██║██║░░░██║  ██║░░░░░██║░░██║░╚═══██╗██╔══╝░░");
            System.out.println("░░░██║░░░╚█████╔╝╚██████╔╝  ███████╗╚█████╔╝██████╔╝███████╗");
            System.out.println("░░░╚═╝░░░░╚════╝░░╚═════╝░  ╚══════╝░╚════╝░╚═════╝░╚══════╝");

            
        }
        System.out.println();
        System.out.println("The Correct Combination was : "+Arrays.toString(colors));
        
        
        
        
    }
    public static void MakeAnswer (char [] colors) {
        int k=0;
        
        //  1  g=green, 
        //  2  k=black, 
        //  3  b=blue, 
        //  4  y=yellow, 
        //  5  w=white, 
        //  6  r=red
        for(int i=0;i<4;i++) {
            k=(int)(Math.random()*6+1);
            if(k==1) {
               colors[i]='g';
            }
            if(k==2) {
                colors[i]='k';
            }
            if(k==3) {
                colors[i]='b';
            }
            if(k==4) {
                colors[i]='y';
            }
            if(k==5) {
                colors[i]='w';
            }
            if(k==6) {
                colors[i]='r';
            }
        }
    }
        
    public static void Ask (char [] playerChoice) {
        Scanner console=new Scanner(System.in);

        for(int i=0;i<4;i++) {
            playerChoice[i]=console.nextLine().charAt(0);
        }
    }
    
    public static void CopyArray(char [] colors,char [] colorsCopy, char [] playerChoice, char [] playerChoiceCopy) {
        for(int i=0;i<colors.length;i++) {
            colorsCopy[i]=colors[i];
            playerChoiceCopy[i]=playerChoice[i];
        }
    }
    public static void Check(char [] colorsCopy,char [] playerChoice,String [] []circle) {
        Exact(colorsCopy,playerChoice,circle);
        
        for(int i=0;i<4;i++) {
            for(int j=0;j<4;j++) {
                if(playerChoice[i]==colorsCopy[j]) {
                    circle[a][b]="O";
                    b++;
                    colorsCopy[j]='Z';
                    playerChoice[i]='Q';
                }
            }
        }
    }
    public static void Exact(char [] colorsCopy,char [] playerChoice,String [] []circle) {
        for(int i=0;i<4;i++) {
            for(int j=0;j<4;j++) {
                if(playerChoice[i]==colorsCopy[i] && i==j) {
                    circle[a][b]="X";
                    b++;
                    colorsCopy[i]='Z';
                    playerChoice[i]='Q';
                }
            }
        }
    }
    
}