package main

import (
	"fmt"
	"strconv"
)

func sumofDigits(n int) int {
	sum := 0
	for i := range strconv.Itoa(n) {
		digit, _ := strconv.Atoi(string(strconv.Itoa(n)[i]))
		sum += digit
	}
	return sum
}

func main() {
	fmt.Println(sumofDigits(1234))
}