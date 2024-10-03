package bossCoderProblems.twoDArrays;

    import java.util.List;
import java.util.ArrayList;
public class p124_flippingImage {
        static List<List<Integer>> solve(List<List<Integer>> input) {
            int inputSize = input.size();
            List<List<Integer>> flip = new ArrayList<>();

            // Flip the image horizontally
            for (int i = 0; i < inputSize; i++) {
                List<Integer> row = new ArrayList<>();
                for (int j = 0; j < inputSize; j++) {
                    row.add(input.get(i).get(inputSize - j - 1));
                }
                flip.add(row);
            }

            // Invert the image
            for (int i = 0; i < inputSize; i++) {
                for (int j = 0; j < inputSize; j++) {
                    if (flip.get(i).get(j) == 0) {
                        flip.get(i).set(j, 1);
                    } else {
                        flip.get(i).set(j, 0);
                    }
                }
            }
            return flip;
        }

        public static void main(String[] args) {
            List<List<Integer>> image = new ArrayList<>();
            image.add(new ArrayList<>(List.of(1, 1, 0)));
            image.add(new ArrayList<>(List.of(1, 0, 1)));
            image.add(new ArrayList<>(List.of(0, 0, 0)));

            List<List<Integer>> result = solve(image);

            // Print the result
            for (List<Integer> row : result) {
                System.out.println(row);
            }
        }
    }


