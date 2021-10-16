

 /*有一天 pb和zs玩游戏 你需要帮zs求出每局的胜败情况

题目描述
游戏规则是这样的： 每次一个人可以对给出的数进行分割，将其割成两个非零自然数，之后由另一个人选择留下两个数中的其中一个；之后由另一个人进行分割这个剩下的数，重复步骤……

当一个人无法对数进行分割的时候游戏结束，另一个人获胜     注：两个人都聪明绝顶

现在要你求出N次游戏的胜败  

每局由pb先进行分割，如果pb赢输出"pb wins" 如果zs赢输出"zs wins" */

/*分析 
   单数zs赢 
   双数 pb赢*/

#include<stdio.h>
int main()
{
    int n,i,x;
    scanf("%d",&n);
    for(i=0;i<n;i++){
        scanf("%d",&x);
        if(x%2==0){
            printf("pb win\n");
        }
        else printf("zs win\n");
    }
    return 0;

}