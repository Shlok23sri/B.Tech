#include <stdio.h>
#include <stdlib.h>

struct Node{
    int data;
    struct Node *next;
};

void push(struct Node **head_ref, int new_data){
    struct Node *new_node = (struct Node*)malloc(sizeof(struct Node));
    new_node->data = new_data;
    new_node->next = (*head_ref);
    (*head_ref) = new_node;
}

void pop(struct Node **head_ref){
    struct Node *ptr;
    if(*head_ref == NULL){
        printf("\nList is empty");
    }else{
        ptr = *head_ref;
        *head_ref = ptr->next;
        free(ptr);
        printf("\n Node deleted from the beginning");
    }
}

int main(){
    // linked list
    struct Node *head = NULL;

    push(&head, 1);
    push(&head, 2);
    push(&head, 3);

    // print linked list
    struct Node *ptr = head;
    while(ptr != NULL){
        printf("%d -> ", ptr->data);
        ptr = ptr->next;
    }
    printf("NULL\n");

    pop(&head);

    return 0;
}