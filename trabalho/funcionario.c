#include "funcionario.h"

struct data {
 int dia;
 int mes;
 int ano;
};

struct os
{
    int id;
    Data d_ins;
    Data d_exe;
    char atividade[15];
    char nome[80];
    char funcao [20];
    char des[500];
    int status;
};

void os_remove (Os* p)
{
    free(p);
}

Os* os_add ()
{
    Os* p = (Os*)malloc(sizeof(Os));
    return p;
}
Os* os_edit(Os* p,int n)
{
    switch (n){
    case 0:
        printf("digite um Id: ");
        scanf("%i", p->id);
        break;
    case 1:
        printf("digite o dia ");
        scanf("%i", p->d_ins.dia);
        printf("digite o mes ");
        scanf("%i", p->d_ins.mes);
        printf("digite o ano ");
        scanf("%i", p->d_ins.ano);
        break;
    case 2:
        printf("digite o dia ");
        scanf("%i", p->d_exe.dia);
        printf("digite o mes ");
        scanf("%i", p->d_exe.mes);
        printf("digite o ano ");
        scanf("%i", p->d_exe.ano);
        break;
        printf("digite um Id: ");
        scanf("%i", p->id);
        break;
    case 4:
        printf("digite a ativide: ");
        scanf("%[^\n]s", p->atividade);
        break;
    case 5:
        printf("digite nome do funcionario: ");
        scanf("%[^\n]s", p->nome);
        break;
    case 6:
        printf("digite a funcao: ");
        scanf("%[^\n]s", p->funcao);
        break;
    case 7:
        printf("digite a descricao: ");
        scanf("%[^\n]s", p->des);
        break;
    case 8:
        printf("digite o status: ");
        scanf("%i", p->status);
        break;
    default:
        printf("DEU RUIM VIADO");
        break;
   }
}
int os_Istatus(Os* p)
{
    return p->status;
}

