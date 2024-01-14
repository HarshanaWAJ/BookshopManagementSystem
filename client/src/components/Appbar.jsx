import * as React from 'react';
import AppBar from '@mui/material/AppBar';
import Box from '@mui/material/Box';
import Toolbar from '@mui/material/Toolbar';
import Typography from '@mui/material/Typography';
import Button from '@mui/material/Button';
import IconButton from '@mui/material/IconButton';
import BookOutlinedIcon from '@mui/icons-material/BookOutlined';
import AccountCircleOutlinedIcon from '@mui/icons-material/AccountCircleOutlined';

export default function ButtonAppBar() {
    const appBarStyle = {
        backgroundColor: '#ffca28', //background color 
        color: 'black', //font color 
    };

    return (
        <Box sx={{ flexGrow: 1 }}>
            <AppBar position="static" style={appBarStyle}>
                <Toolbar>
                    <IconButton
                        size="large"
                        edge="start"
                        color="inherit"
                        aria-label="menu"
                        sx={{ mr: 2 }}
                    >
                        <BookOutlinedIcon />
                    </IconButton>

                    <Typography component='div' sx={{
                        flexGrow: 0,
                        '&:hover': {
                            cursor: 'pointer', // Change the cursor on hover
                            textDecoration: 'none',
          
                        },
                    fontSize:'20px', fontWeight:'bold', fontFamily:'times new roman'}}>
                    E-BOOKSHOP
                    </Typography>
                    
                    <Typography variant="h6" component="div" sx={{ flexGrow: 1}}>
                        <Button color="inherit" sx={{fontWeight:'bold'}}>Home</Button>
                        <Button color="inherit" sx={{fontWeight:'bold'}}>About Us</Button>
                        <Button color="inherit" sx={{fontWeight:'bold'}}>Contact Us</Button>
                    </Typography>
                    <IconButton
                        size="large"
                        edge="start"
                        color="inherit"
                        aria-label="menu"
                        sx={{ mr: 2 }}
                    >
                        <AccountCircleOutlinedIcon />
                    </IconButton>
                    
                </Toolbar>
            </AppBar>
        </Box>
    );
}
