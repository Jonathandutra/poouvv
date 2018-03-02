typedef lista;
/* Criar um lista */
lista* lstCria(void);
/* Inserir elemento em uma lita*/
lista* lstInserir(lista* L, int x);
/*Imprimir valores da lista*/
void  lstImprimir(lista* L);
/*Verificar se a lista esta vazia */
int lstIsVazia(lista* L);
/* Buscar valor*/
lista* lstBusca(lista* L, int x);
/*Apagar elemetentos da lsita*/
lista* lstApaga(lista* L, int x);
