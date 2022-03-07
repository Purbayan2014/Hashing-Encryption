Alphabet = 'ABCDEFGHIJKLMNOPQRSTUVWXYZ'

key = eval(input(" [-] Value of the key  ---- >  "))


def ceasar_encrypt(usr_text):
    cipher_text = ''
    usr_text = usr_text.upper()
    for c in usr_text:
        index = Alphabet.find(c)  # X < -------
        index = (index + key) % len(Alphabet)
        cipher_text += Alphabet[index]

    return cipher_text


def ceasar_decrypt(encrypted_text):
    decrypted_text = ''
    for c in encrypted_text:
        index = Alphabet.find(c)
        index = (index - key) % len(Alphabet)
        decrypted_text += Alphabet[index]

    return decrypted_text


def main():
    usr_text = input("[-] Text to be encrypted --- > ")
    encrypted = ceasar_encrypt(usr_text)
    print("[-] Encrypted text ---> " + encrypted)
    decrypted = ceasar_decrypt(encrypted)
    print("[-] Decrypted Text : " + decrypted)


if __name__ == "__main__":
    main()
