package ArrayandString;

import java.util.*;

public class WordLadder {

    public int ladderLength(String beginWord, String endWord, List<String> wordList) {

        HashSet<String>set = new HashSet<>();

        if (!set.contains(endWord)){
            return 0;
        }

        Queue<String>q = new LinkedList<>();
        q.offer(beginWord);
        int level=1;

        while (!q.isEmpty()){

            int size = q.size();
            for (int i=0;i<size;i++){
                String curr_word = q.poll();
                char[]word_curr = curr_word.toCharArray();
                for (int j=0;j<word_curr.length;j++){
                    char original = word_curr[j];
                    for (char c ='a';c<'z';c++){
                        if (word_curr[j]==c) continue;
                        word_curr[j]=c;
                        String new_word = String.valueOf(word_curr);
                        if (new_word.equals(endWord)) return level+1;

                        if (set.contains(new_word)){
                            q.offer(new_word);
                            set.remove(new_word);
                        }
                    }
                    word_curr[j] = original;
                }
            }
            level++;
        }
          return 0;
    }
}
