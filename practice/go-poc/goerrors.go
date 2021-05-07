package main

import (
	"fmt"
	"errors"
)

func f1(arg int) (int, error){
	if arg == 42 {
		return -1, errors.New("Can't work with this number")
	}

	return arg+3, nil
}

type argError struct {
	arg int
	msg string
}

func (e *argError) Error() string{
	return fmt.Sprintf("%d - %s", e.arg, e.msg)
}

func f2(arg int) (int, error){
	if arg == 42 {
		return -1, &argError{arg, "Can not work!"}
	}

	return arg+3, nil
}

func main(){
	for _, i := range []int{7,42}{
		if r, e := f1(i); e!=nil {
			fmt.Println("f1 failed!", e)
		} else {
			fmt.Println("f1 succeed!", r)
		}
	}

	for _, i := range []int{7,42}{
		if r, e := f2(i); e!=nil {
			fmt.Println("f2 failed!", e)
		} else {
			fmt.Println("f2 succeed!", r)
		}
	}


}