package main

import (
	"fmt"
	"math"
)

type geometry interface{
	area() float32
	perim() float32
}

type circle struct {
	rad float32
}

type rect struct {
	width float32
	height float32
}

func (c circle) area() float32{
	return math.Pi * c.rad * c.rad
}

func (c circle) perim() float32{
	return 2 * math.Pi * c.rad
}

func (r rect) area() float32 {
	return r.width * r.height
}

func (r rect) perim() float32 {
	return 2 * (r.width + r.height)
}

func measure(g geometry) {
	fmt.Println(g)
	fmt.Println("Area", g.area())
	fmt.Println("Perim", g.perim())
}

func main(){
	c := circle{rad:2.0}
	r := rect{width:5, height:10}

	measure(c)
	measure(r)
}