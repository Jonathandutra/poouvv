/* Tipo exportado */
typedef struct ponto Ponto;
/* Fun��es exportadas */
/* Fun��o cria - Aloca e retorna um ponto com coordenadas (x,y) */
Ponto* pto_cria (float x, float y);
/* Fun��o libera - Libera a mem�ria de um ponto previamente criado */
void pto_libera (Ponto* p);
/* Fun��o acessa - Retorna os valores das coordenadas de um ponto */
void pto_acessa (Ponto* p, float* a, float* b);
/* Fun��o atribui - Atribui novos valores �s coordenadas de um ponto */
void pto_atribui (Ponto* p, float a, float b);
/* Fun��o distancia - Retorna a dist�ncia entre dois pontos */
float pto_distancia (Ponto* a, Ponto* b);

