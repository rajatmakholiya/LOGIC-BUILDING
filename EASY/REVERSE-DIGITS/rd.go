package main

import {
	"fmt"
	"strconv"
}

func reverseDigits(n int) int {
	s:= strconv.Itoa(n)
	return strconv.Atoi(s[::-1])
}
func main() {
	fmt.Println(reverseDigits(12345))
}