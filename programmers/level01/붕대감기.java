// PCCP 기출 문제 1번 붕대감기
// https://school.programmers.co.kr/learn/courses/30/lessons/250137
public class 붕대감기 {
  public int solution(int[] bandage, int health, int[][] attacks) {
    int answer = 0;
    int currentHealth = health;
    int currentTime = 0;

    for(int[] attack : attacks) {
      if(currentHealth == health) {
        currentHealth -= attack[1];
        currentTime = attack[0];
      } else {
        int temTime = attack[0] - currentTime - 1; // 공격시점에는 치유할 수 없으므로
        int bonusHealCount = temTime / bandage[0];
        int totalHeal = (bonusHealCount * bandage[2]) + (bandage[1] * temTime);

        currentHealth = currentHealth + totalHeal;
        if(currentHealth > health) currentHealth = health;
        currentHealth = currentHealth - attack[1];
        if(currentHealth <= 0) {
          answer = -1;
          break;
        } else {
          answer = currentHealth;
        }
        currentTime = attack[0];
      }
    }

    return answer;
  }
}
