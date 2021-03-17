package programmers.lv2;

public class Skiltree {
    public static void main(String[] args) {
        String skill = "CBD";
        String[] skill_trees = {"BACDE", "CBADF", "AECB", "BDA"};
        System.out.print(solution(skill, skill_trees));
    }
    public static int solution(String skill, String[] skill_trees) {
        int answer = 0;
        int treeLength = skill_trees.length;

        for (int i=0; i<treeLength; i++) {
            boolean flag = true;
            String[] skills = skill_trees[i].split("");
            int count=0;
            int skillsLen = skills.length;
            for (int j=0; j<skillsLen; j++) {
                if ( count < skill.indexOf(skills[j])) {
                    flag = false;
                    break;
                } else if( count == skill.indexOf(skills[j])) {
                    count++;
                }
            }
            if (flag) {
                answer++;
            }
        }

        return answer;
    }
}
