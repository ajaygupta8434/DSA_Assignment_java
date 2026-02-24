class Queue_assignment_8 {

    static void findFirstNonRepeating(char stream[]) {

        int freq[] = new int[26];   // frequency array
        char queue[] = new char[stream.length];
        int front = 0, rear = -1;

        for (int i = 0; i < stream.length; i++) {

            char ch = stream[i];

            // Step 1: Increase frequency
            freq[ch - 'a']++;

            // Step 2: Add to queue
            queue[++rear] = ch;

            // Step 3: Remove repeating characters from front
            while (front <= rear && freq[queue[front] - 'a'] > 1) {
                front++;
            }

            // Step 4: Print result
            if (front <= rear)
                System.out.print(queue[front] + " ");
            else
                System.out.print("# ");
        }
    }

    public static void main(String[] args) {

        char stream[] = {'a','a','b','c'};

        findFirstNonRepeating(stream);
    }
}