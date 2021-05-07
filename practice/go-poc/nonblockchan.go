package main

import (
	"fmt"
)

func main(){
	message := make(chan string)

	select {
	case msg := <- message:
		fmt.Println("received msg", msg)
	default:
		fmt.Println("no msg received")
	}

	m1 := <- message

	msg := "hi"
	select {
	case message <- msg:
		fmt.Println("sent msg", msg)
	default:
		fmt.Println("no msg sent")
	}

	fmt.Println(m1)
}