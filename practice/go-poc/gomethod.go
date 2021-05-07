package main

import (
	"fmt"
)

type rect struct {
	width int
	height int
}

func (r *rect) area() int{
	return r.width * r.height
}

func (r rect) perim() int{
	return (r.width+r.height)*2
}

func main(){
	rect1 := rect{width: 10, height:5}

	fmt.Println("Area", rect1.area())
	fmt.Println("Perim", rect1.perim())
}