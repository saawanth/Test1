# setibackend 
# pull the project into your local and run the project
# open h2 database with localhost:8080/console
connect to h2
run command select * from user

# Open postman 
# user method POST 
# use link http://localhost:8080/users
in body  

{
    "name": "sai",
    "phoneNumber": "343434",
    "email": "g@climate.com",
    "dob": "10/11/1991",
    "locale": "US"
}
use this and click button send
# You will see  201 status created 

# To check validations 
{
    "name": "sai",
    "phoneNumber": "343434",
    "email": "g@gmail.com",
    "dob": "10/11/1991",
    "locale": "USA"
}

# change the values at email and dob locale 
and click button send 
# you will find the status 400 Bad request


# To get Values Use GET methos 
http://localhost:8080/users/1

to get the values 
http://localhost:8080/users/2

change the different id and check values 










