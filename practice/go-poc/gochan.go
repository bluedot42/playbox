package main

import (
	"fmt"
)

func main(){
	message := make(chan string,2)

	message <- "ping"
	message <- "pong"

	msg := <- message
	msg2 := <- message

	fmt.Println(msg)
	fmt.Println(msg2)
}