package main

import "fmt"

func main(){
	queue := make(chan string, 2)

	queue <- "str1"
	// queue <- "str2"
	close(queue)

	for e := range queue {
		fmt.Println(e)
	}
}