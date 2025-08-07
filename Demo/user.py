import bcrypt

USERS = "users.tx"

def hash_password(password):
    return bcrypt.hashpw(password.encode(), bcrypt.gensalt())

def register(username, password):
   with open (USERS, "a") as file:
       hpass = hash_password(password)
       file.write(f"{username},{hpass}\n")
       return "registered successfully"

register(username="Ade", password="password")

def main():
    option = input("Enter 1 to register or 2 to login:  ")
    match option:
        case "1":
            username = input("Enter username: ")
            password = input("Enter password: ")
            register(username, password)

main()