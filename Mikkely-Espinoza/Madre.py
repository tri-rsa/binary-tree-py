class Animal:
    def getType(self):
        return self.__tipo

    def getSound(self):
        return self.__sound

    def getGender(self):
        return self.__genero

    def __init__(self,genero,tipo,sound):
        self.__genero=genero
        self.__tipo=tipo
        self.__sound=sound

    def says(self):
        return self.getGender()+" "+self.getType()+" says "+self.getSound()
    

