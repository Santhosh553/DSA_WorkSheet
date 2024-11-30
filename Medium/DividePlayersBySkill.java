/*
 * Divide Players By Skill
 * You are given an array of integers, where each element represents the skill level of a player.
 * skill = [3,2,5,1,3,4] total skill = 18 initial team skill = 18/3 = 6
 * 1st build hashmap of skill level and their count.
 * before 2sum reduce hashmap count of skill level by 1.
 * implement 2 sum logic to find the team of 2 players with equal skill level.
 * after 2sum reduce hashmap count of skill level by 1.
 * if not found return -1.
 * get the pair of players and multiply their skill level.
 */
import java.util.HashMap;
import java.util.Scanner;

public class DividePlayersBySkill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] skill = new int[n];
        for(int i=0;i<n;i++){
            skill[i] = sc.nextInt();
        }
        HashMap<Integer,Integer> map = new HashMap<>();
        int totalskill = 0;
        for(int i:skill){
            totalskill+=i;
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        //System.out.println(map);
        long ans = 0;
        int teamskill = totalskill/(skill.length/2);
        
        for(int i:skill){
            if(map.get(i)>0){
                map.put(i,map.get(i)-1);
                int rem = teamskill - i;
                if(!map.containsKey(rem) || map.get(rem)<=0)
                    {System.out.println(-1);return;}
                map.put(rem,map.get(rem)-1);
                ans += i*rem;
            }
        }

    }
}
