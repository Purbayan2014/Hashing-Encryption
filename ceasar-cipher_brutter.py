Alphabet = 'ABCDEFGHIJKLMNOPQRSTUVWXYZ'


def crack(encypted_text):
    for key in range(len(Alphabet)):
        plain_text = ''

        for c in encypted_text:
            index = Alphabet.find(c)
            index = (index - key) % len(Alphabet)
            plain_text += Alphabet[index]
        print("With the key %s the decrypted text is %s" % (key, plain_text))


if __name__ == "__main__":
    encrypted = input('[-] Provide the encrypted text ')
    crack(encrypted)
