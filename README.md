"" Source your .vimrc
"source ~/.vimrc

"" -- Suggested options --
" Show a few lines of context around the cursor. Note that this makes the
" text scroll if you mouse-click near the start or end of the window.
set scrolloff=5
set number relativenumber
set idearefactormode=keep
set ideajoin
" Do incremental searching.
set incsearch

" Don't use Ex mode, use Q for formatting.
map Q gq

let mapLeader = " "

"System clipboard
vmap <leader>y "+y
vmap <leader>d "+d
nmap <leader>y "+yy
nmap <leader>p "+p
nmap <leader>P "+P
vmap <leader>p "+p
vmap <leader>P "+P


"Tab navigation
nmap <leader>h : action PreviousTab<CR>
nmap <leader>l : action NextTab<CR>
nmap <leader>bd : action CloseEditor<CR>
nnoremap <leader><leader> <C-Tab>
"extensions
set surround

set NERDTree
let g:NERDTreeMapActivateMode='l'
let g:NERDTreeMapJumpParent ='h'

"" -- Map IDE actions to IdeaVim -- https://jb.gg/abva4t
"" Map \r to the Reformat Code action
"map \r <Action>(ReformatCode)

"" Map <leader>d to start debug
"map <leader>d <Action>(Debug)

"" Map \b to toggle the breakpoint on the current line
"map \b <Action>(ToggleLineBreakpoint)


" Find more examples here: https://jb.gg/share-ideavimrc
