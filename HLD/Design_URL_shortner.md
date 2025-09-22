Problem Statement:

lets say we have any kind of huge link then we need create URL shortener for that particular link 


We have to create two APIS 
createShortlink(LongURL)  -- return the short link 

getLongURL(shortURL) -- return the long URL

Requirements Gathering:
Quesion to ask the Interviewer:
how much short the newly created URL should be ?

How much traffic we are expecting to handle everyday ?
10M URL/per day --- so per year this will be 3650M URL/ per year

How much time the short link should be valid ?
100 year

So total URL count we need to create is  3650M * 100 = 365Billions URL needs to be created 


What all are the characters we can use in the short link ?
A-Z , a-z , 0-9 -- total 26+26+10 = 62 characters 

How many characters we need to create the short link ?
if we use 6 characters then total possible combinations are 62^6 = 56 Billion Combinations
if we use 7 characters then total possible combinations are 62^7 = 3.5 Trillion Combinations

so we can got with 7 characters in the short link 

Now the question we have to ask ourself is how to generate the unique 7 character string for the short link 

Possible Approaches to generate the unique 7 character string for the short link are 
1. Hashing Algorithm 
2. Encoding Algorithm

So in Hashing Algorithms 

first one is MD5 (Message Digest Algorithm) which generates the 128 bit hash value 
so whatever be the value of key it always generates the 128 bit hash value 

so now if we want to convert it to Hexa Decimal value then it will be 32 characters

for one single character we have 4 bits in hexa decimal format 

so it is 128/4 = 32 characters 

And like wise for SHA-256 it generates 256 bit then in Hexa Decimal format it will be 64 characters 
And like wise for SHA-512 it generates 512 bit then in Hexa Decimal format it will be 128 characters 

but we want only the 7 characters in the short link 

So we can take the first 7 characters from the generated hash value and use it as short link 

but the problem with this approach is collision may happen with this



