import java.util.Scanner;

public class GlobalWarmingQuiz {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] questions = {
            "1. What is the main greenhouse gas attributed to human activity?",
            "2. What is one argument made by global warming skeptics?",
            "3. Which organization shared the 2007 Nobel Peace Prize for work on climate change?",
            "4. What is a potential consequence of global warming cited by scientists?",
            "5. What do some skeptics claim about the Earth's recent temperature trends?"
        };

        String[][] options = {
            {"1. Nitrogen", "2. Oxygen", "3. Carbon Dioxide", "4. Helium"},
            {"1. Global warming is a hoax", "2. Climate models are 100% accurate",
             "3. All scientists agree on global warming", "4. The ozone hole causes global warming"},
            {"1. World Health Organization", "2. Greenpeace", 
             "3. Intergovernmental Panel on Climate Change (IPCC)", "4. NASA"},
            {"1. Global cooling", "2. Sea level rise and extreme weather", 
             "3. Increase in ice coverage", "4. Decreased solar activity"},
            {"1. The Earth is rapidly warming", "2. Temperatures have been steady or declined slightly since the late 1990s",
             "3. CO2 has no effect on climate", "4. Volcanoes are the only contributors to warming"}
        };

        int[] correctAnswers = {3, 1, 3, 2, 2}; // Correct options (1-based indexing)
        int score = 0;

        // Quiz loop
        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            for (String option : options[i]) {
                System.out.println(option);
            }

            System.out.print("Your answer (1-4): ");
            int answer = input.nextInt();

            if (answer == correctAnswers[i]) {
                score++;
            }
            System.out.println();
        }

        // Results
        System.out.println("You got " + score + " out of 5 correct.");

        if (score == 5) {
            System.out.println("Excellent!");
        } else if (score == 4) {
            System.out.println("Very good!");
        } else {
            System.out.println("Time to brush up on your knowledge of global warming.");
            System.out.println("Here are some resources to explore both sides:");
            System.out.println("- https://climate.nasa.gov/");
            System.out.println("- https://www.ipcc.ch/");
            System.out.println("- https://skepticalscience.com/");
            System.out.println("- https://www.heartland.org/");
            System.out.println("- https://www.cato.org/blog/tags/global-warming");
        }

        input.close();
    }
}
