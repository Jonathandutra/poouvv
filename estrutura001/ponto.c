#include <stdio.h>
#include "ponto.h"
#include <math.h>

struct ponto {
    float x;
    float y;
};

Ponto* pto_criar (float x, float y){
    Ponto* p =(Ponto*) malloc(sizeof(Ponto));
    if(p==NULL){
        exit(0);
    }
    p->x = x;
    p->y = y;
    return p;
}
void libera_ponto (Ponto* a)
{
    free(a);
}

void acesso_ponto(Ponto* p, float* a, float* b){

    *a = p->x;
    *b = p->y;
}
void atribuir_ponto(Ponto* p , float a, float b)
{
    p->x = a;
    p->y = b;
}
float distancia_ponto(Ponto*a , Ponto* b)
{
    return sqrt(((b->x - a->x)*(b->x - a->x))+((b->y - a->y)*(b->y - a->y)));

}
