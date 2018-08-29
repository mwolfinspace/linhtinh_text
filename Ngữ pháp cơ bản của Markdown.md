# Ngữ pháp cơ bản của Markdown

Tất cả cú pháp của Markdown đều rất rõ ràng và trong sáng. Nếu bạn có thể nhớ 1 lần, bạn sẽ nhớ được mãi mãi.

Hãy coi bài viết này như một tài liệu tra cứu mỗi khi không nhớ ra các cú pháp của Markdown.

## Tiêu đề

Các lớp tiêu đề h1, h2, h3 cho đến h6 có thể viết được bằng cách thêm số lượng ký tự # tương ứng vào đầu dòng. Một ký tự # tương đương với h1 và cứ thế tăng dần lượng # tương ứng.

Tuy nhiên để cho bài viết dễ đọc thì chỉ nên dùng đến ### mà thôi.

```markdown
# Header 1
## Header 2
### Header 3
```

## Bôi đậm và in nghiêng

Kẹp một từ ở đầu và cuối bằng 1 ký tự `*` để *in nghiêng*, hai ký tự `**` để **bôi đậm**, và 3 ký tự `*** ` để ***vừa in nghiêng vừa bôi đậm***.

Nếu muốn bạn có thể dùng `_` thay cho `*`.

Ngoài ra chữ có thể ~~gạch ngang~~ bằng 2 dấu `~~`.

## Link

Viết link trong Markdown bằng cách cho alt text vào trong ngoặc vuông `[]` và link thật vào trong ngoặc đơn `()`. Ví dụ chèn link Google vào chữ Google bên dưới bằng câu sau: `[Google](https://www.google.com.vn)`

[Google](https://www.google.com.vn) 

Ngoài ra có thể thêm chú thích cho đường link bằng cách thêm chú thích vào `""` nằm bên trong ngoặc đơn như sau: `[Google](https://www.google.com.vn "Tìm kiếm Google")`

[Google](https://www.google.com.vn "Tìm kiếm Google") 

## Hình ảnh

Chèn hình ảnh trong Markdown chỉ khác với chèn link đôi chút. Bạn thêm ký tự `!` vào đầu tiên, sau đó ghi alt text và link ảnh vào trong ngoặc vuông `[]` và ngoặc tròn `()`.

![if_letter_R_blue_1553067](https://raw.githubusercontent.com/1234hdpa/linhtinh_text/master/assets/if_letter_R_blue_1553067.png) 

## Định dạng danh sách

Để định dạng một đoạn văn bản thành các gạch đầu dòng trong markdown, bạn dùng ký tự `*` và một dấu cách ở mỗi ý và dùng thêm 2 dấu cách ở đằng trước nếu muốn lùi vào một level. Ngoài ra có thể dùng phím Tab kết hợp với Enter để thao tác.

```markdown
* Phần 1
* Phần 2
  * Mục nhỏ a
  * Mục nhỏ b
* Phần 3
  * Mục nhỏ a
    * Mục nhỏ nữa 1
```



sẽ trở thành:

* Phần 1
* Phần 2
  * Mục nhỏ a
  * Mục nhỏ b
* Phần 3
  * Mục nhỏ a
    * Mục nhỏ nữa 1

Ngoài ra có thể đánh số thứ tự bằng cách thêm dấu `.` sau số thứ tự.

1. Mục 1
2. Mục 2
3. Mục 3

## Trích dẫn

Cách viết một trích dẫn giống hệt khi bạn vẫn trả lời bình luận hay dẫn chứng trong cách diễn đàn; sử dụng ký tự `>`.

```markdown
|Bảng         |Rất         |Tuyệt  |
|-------------|:----------:|------:|
|Cột 2 được   |căng giữa   |  $7000|
|Cột 3 được   |căng phải   |    $90|
|Cột cuối là  |để test     |   chơi|
```

Ở dòng ngăn cách giữa header và content bạn sẽ thấy ký hiệu căn lền trái phải (cột 2 và 3) bằng dấu `:`. Bảng trên sẽ được hiện như sau:

| Bảng        |    Rất    | Tuyệt |
| ----------- | :-------: | ----: |
| Cột 2 được  | căng giữa | $7000 |
| Cột 3 được  | căng phải |   $90 |
| Cột cuối là |  để test  |  chơi |

## Link tài liệu tham khảo

Markdown có thể đánh dấu mỗi link thành từng số và viết tất cả link thực tương ứng với các số ở cuối cùng.

```markdown
Let's check out [Wikipedia][1] and [Google][2].
...
...
[1]: https://en.wikipedia.org "Wikipedia"
[2]: https://www.google.com "Google"
```

Và kết quả như sau:

Let's check out [Wikipedia][1] and [Google][2]. 

... ... 

[1]: https://en.wikipedia.org "Wikipedia"
[2]: https://www.google.com	"Google"

## Link nhanh

Bạn có thể viết link trực tiếp như Google: https://www.google.com.vn

## Chú thích

Chú thích hay footnote sẽ dùng ký tự `^` bên trong ngoặc vuông `[]` đế đánh dấu và viết lại giải thích ở cuối, cách viết tương tự như link tài liệu tham khảo bên trên.

```markdown
John Gruber[^1].
...
...
[^1]: writer, blog publisher, UI designer, the inventor of the Markdown publishing format.
```

Và kết quả như sau:

John Gruber[^1].
...
...

[^1]: writer, blog publisher, UI designer, the inventor of the Markdown publishing format.

## Escape

Sẽ có lúc bạn cần dùng đến đúng những ký tự mà Markdown đang sử dụng, ví dụ đơn giản như khi muốn viết \*bold\* mà không bị in đậm, khi đó kết hợp với ký tự escape `\` phía trước.

```markdown
\*bold\*
```

## Emoji 😁

Test :smile: bằng đoạn mã `:smile:` là được nhé.

Còn :cry: thì bằng `:cry:` nha.

## Lý do chọn Markdown

Nhanh, nhẹ, linh hoạt trong việc chỉnh sửa và đặc biệt không thèm động đến con chuột khi định dạng là điều mình thích nhất ở Markdown. Với việc tích hợp công thức toán và khả năng chuyển định dạng sang LATEX thì Markdown rất phù hợp cho người hay soạn thảo các bài viết Toán học như mình.

Nguồn tham khảo: [Kipalog](https://kipalog.com/posts/Huong-dan-su-dung-Markdown-tren-Kipalog).