from Madre import Animal
class Pollito(Animal):
    def __init__(self):
        super().__init__("El","Pollito","PIO")

from Madre import Animal
class Gallina(Animal):
    def __init__(self):
        super().__init__("La","Gallina","COO")

from Madre import Animal
class Gallo(Animal):
    def __init__(self):
        super().__init__("El","Gallo","COCORÓCO")

from Madre import Animal
class Pavo(Animal):
    def __init__(self):
        super().__init__("El","Pavo","GLU GLU GLU")

from Madre import Animal
class Paloma(Animal):
    def __init__(self):
        super().__init__("La","Paloma","RUU")

from Madre import Animal
class Gato(Animal):
    def __init__(self):
        super().__init__("El","Gato","MIAU")

from Madre import Animal
class Perro(Animal):
    def __init__(self):
        super().__init__("El","Perro","GUAU GUAU")

from Madre import Animal
class Cabra(Animal):
    def __init__(self):
        super().__init__("La","Cabra","MEEE")

from Madre import Animal
class Cordero(Animal):
    def __init__(self):
        super().__init__("El","Cordero","BEEE")

from Madre import Animal
class Vaca(Animal):
    def __init__(self):
        super().__init__("La","Vaca","MOO")

from Madre import Animal
class Toro(Animal):
    def __init__(self):
        super().__init__("El","Toro","MUU")

from Madre import Animal
class Tractor(Animal):
    def __init__(self):
        super().__init__("El","Tractor","BRRR")

class New(Animal):
#SCRIPT
    granja=[Pollito(),Gallina(),Gallo(),Pavo(),Paloma(),Gato(),Perro(),Cabra(),Cordero(),Vaca(),Toro(),Tractor()]

    for animal in granja:
        print(animal.says())