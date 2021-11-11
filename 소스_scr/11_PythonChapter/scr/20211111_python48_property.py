class Rect:
    def __init__(self,width,height):
        if width <=0 or height <=0:
            raise Exception("너비와 높이는 음수가 나올 수 없습니다.")
        #self.width=width
        #self.height=height
        self.__width=width
        self.__height=height
    def get_area(self):
        return self.width * self.height
    #
    #def get_width(self):
    #    return self.__width
    #def set_width(self,width):
    #    if width <=0:
    #        raise Exception("너비와 높이는 음수가 나올 수 없습니다.")
    #    self.__with=width
   
    #def get_height(self):
    #    return self.__height
    #def set_height(self,height):
    #    if height <=0:
    #        raise Exception("너비와 높이는 음수가 나올 수 없습니다.")
    #    self.__height=height
    @property
    def width(self):
        return self.__width
    @width.setter
    def width(self,width):
        if width <=0:
            raise Exception("너비와 높이는 음수가 나올 수 없습니다.")
        self.__with=width

    @property
    def height(self):
        return self.__height
    @height.setter
    def height(self,height):
        if height <=0:
            raise Exception("너비와 높이는 음수가 나올 수 없습니다.")
        self.__height=height

rect = Rect(10,10)
#rect.set_width(rect.get_width()+10)
#rect.width=-10
#rect.height=-10

rect.width += 20
print(rect.get_area())

