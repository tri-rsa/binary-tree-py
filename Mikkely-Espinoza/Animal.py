class Animal:
    def getType(self):
        return __tipo

    def getSound(self):
        return __sound

    def getGender(self):
        return __genero

    def __init__(self,genero,tipo,sonido):
        self.__genero=genero
        self.__tipo=tipo
        self.__sound=sound

    def says(self):
        return self.getGender()+" "+self.getType()+" says "+self.getSound()
    

