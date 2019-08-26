def main(): 

	num1 = input('Enter your first number Ivy: ')
	num2 = input('Enter your second number Ivy: ')

	OptionList = ['add', 'subtract', 'multiply', 'divide']

	res = input('Now, what would you like to do with these numbers?')
	if res.lower() in OptionList:
		if res == 'add':
			result = num1 + num2
		if res == 'subtract':
			result = num1 - num2
		if res == 'multiply':
			result = num1 * num2
		else:
			result = num1 / num2
	else:
		print('Not a valid Option!')
	return result


